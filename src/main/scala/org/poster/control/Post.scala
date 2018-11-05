package org.poster.control
import java.text.SimpleDateFormat

import org.poster.model.DBWorker

class Post {
    var id: Int = 0
    var date: String = _
    var name: String = _
    var msg: String = _
    var user_id: Int = 1

    def GetPostDate(): String = {
        val date = new java.util.Date
        val format_date = new SimpleDateFormat("yyyy-MM-dd")
        format_date.format(date)
    }

    def WritePost(user_name: String, message: String, user_id: Int): Int = {
        val date = GetPostDate()
        var name = ""
        if (user_name.isEmpty) name = "anonymous"
        else name = user_name

        if (message.isEmpty) {
            println("<E> MESSAGE IS EMPTY!")
            -1
        } else {
            DBWorker.SetPost(name, message, date, user_id)
            0
        }
    }

    def GetAllPosts(): List[Post] = {
        DBWorker.setCursor()
        var plist = List[Post]()

        while (DBWorker.isAccessed) {
            val post = new Post()
            val (tid, tname, tmsg, tdate, tuser_id) = DBWorker.getRow()
            post.id   = tid
            post.name = tname
            post.msg  = tmsg
            post.date = tdate
            post.user_id = tuser_id
            plist = post :: plist
        }

        plist
    }


    def GetUserPosts(user_id: Int): List[Post] = {
        DBWorker.setUserCursor(user_id)
        var plist = List[Post]()

        while (DBWorker.isAccessed) {
            val post = new Post()
            val (tid, tname, tmsg, tdate, tuser_id) = DBWorker.getRow()
            post.id   = tid
            post.name = tname
            post.msg  = tmsg
            post.date = tdate
            post.user_id = tuser_id
            plist = post :: plist
        }

        plist
    }


    def GetSpecPost(post_id: Int): Unit = {
        DBWorker.setPostCursor(post_id)

        if (DBWorker.isAccessed) {
            val (tid, tname, tmsg, tdate, tuser_id) = DBWorker.getRow()
            id = tid
            name = tname
            msg = tmsg
            date = tdate
            user_id = tuser_id
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
            DBWorker.UpdatePost(name, message, date, user_id, id)
            0
        }
    }
}
