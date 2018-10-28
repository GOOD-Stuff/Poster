package org.poster.model
import java.text.SimpleDateFormat

import org.poster.control.DBWorker

class Post {
    var date: String = _
    var name: String = _
    var msg: String = _

    def GetPostDate(): String = {
        val date = new java.util.Date
        val format_date = new SimpleDateFormat("yyyy-MM-dd")
        format_date.format(date)

    }

    def WritePost(user_name: String, message: String): Unit = {
        val date = GetPostDate()
        var name = ""
        if (user_name.isEmpty) name = "anonymous"
        else name = user_name

        if (message.isEmpty) {
            println("<E> MESSAGE IS EMPTY!")
            throw new Exception
        }
        
        DBWorker.SetPost(name, message, date)
    }

    def GetAllPosts(): List[Post] = {
        DBWorker.setCursor()
        var plist = List[Post]()

        while (DBWorker.isAccessed) {
            val post = new Post()
            val (tname, tmsg, tdate) = DBWorker.getRow()
            post.name = tname
            post.msg  = tmsg
            post.date = tdate

            plist = post :: plist
        }

        plist
    }
}
