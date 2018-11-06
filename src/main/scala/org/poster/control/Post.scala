package org.poster.control
import java.text.SimpleDateFormat

import org.poster.model.DBWorker

import java.io.{File, FileOutputStream, InputStream, OutputStream}
import java.util.concurrent.atomic.AtomicLong


class Post {
    var id: Int = 0
    var date: String = _
    var name: String = _
    var msg: String = _
    var user_id: Int = 1
    var photo_path: String = _
    private val path = "/img/posts"

    def GetPostDate(): String = {
        val date = new java.util.Date
        val format_date = new SimpleDateFormat("yyyy-MM-dd")
        format_date.format(date)
    }


    def WritePost(user_name: String, message: String, user_id: Int, photo_path: String): Int = {
        val date = GetPostDate()
        var ipath = ""
        var name = ""
        if (user_name.isEmpty) name = "anonymous"
        else name = user_name

        if (!(photo_path.isEmpty))
            ipath = path + "/" + photo_path

        if (message.isEmpty || (message == null)) {
            println("<E> MESSAGE IS EMPTY!")
            -1
        } else {
            DBWorker.SetPost(name, message, date, user_id, ipath)
            0
        }
    }


    def GetAllPosts(): List[Post] = {
        DBWorker.setCursor()
        var plist = List[Post]()

        while (DBWorker.isAccessed) {
            val post = new Post()
            val (tid, tname, tmsg, tdate, tuser_id, timage_path) = DBWorker.getRow()
            post.id   = tid
            post.name = tname
            post.msg  = tmsg
            post.date = tdate
            post.user_id = tuser_id
            post.photo_path = timage_path
            plist = post :: plist
        }

        plist
    }


    def GetUserPosts(user_id: Int): List[Post] = {
        DBWorker.setUserCursor(user_id)
        var plist = List[Post]()

        while (DBWorker.isAccessed) {
            val post = new Post()
            val (tid, tname, tmsg, tdate, tuser_id, timage_path) = DBWorker.getRow()
            post.id   = tid
            post.name = tname
            post.msg  = tmsg
            post.date = tdate
            post.user_id = tuser_id
            post.photo_path = timage_path
            plist = post :: plist
        }

        plist
    }


    def GetSpecPost(post_id: Int): Unit = {
        DBWorker.setPostCursor(post_id)

        if (DBWorker.isAccessed) {
            val (tid, tname, tmsg, tdate, tuser_id, timage_path) = DBWorker.getRow()
            id = tid
            name = tname
            msg = tmsg
            date = tdate
            user_id = tuser_id
            photo_path = timage_path
        }
    }


    def EditUserPost(user_name: String, message: String): Int = {
        val date = GetPostDate()
        var name = ""
        if (user_name.isEmpty) name = "anonymous"
        else name = user_name

        if (message.isEmpty) {
            println("<E> MESSAGE IS EMPTY!")
            -1
        } else {
            DBWorker.UpdatePost(name, message, date, user_id, id, photo_path)
            0
        }
    }


    def UploadImage(file_name: String, in: InputStream): Unit = {
        //val root =
        val out = new FileOutputStream(f"$path/$file_name")
        copyStream(in, out)
        photo_path = path + file_name
    }


    private def copyStream(input: InputStream, output: OutputStream): Unit = {
        val buffer = Array.ofDim[Byte](1024)
        var bytesRead = 0
        while (bytesRead != -1) {
            bytesRead = input.read(buffer)
            if (bytesRead > 0) output.write(buffer, 0, bytesRead)
        }
    }
}
