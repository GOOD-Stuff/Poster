package org.poster.control

import org.poster.model.DBWorker

class User {
    var id = 1
    var password = ""
    var user_name = "anonymous"
    println("Call User construct!")

    def UserLogin(login: String, password: String): Int = {
        val (tid, tpass) = DBWorker.FindUser(login)
        id = tid
        this.password = tpass
        if ((id > 1) && (this.password == password)) {
            user_name = login;
            0
        }
        else -1
    }

    def UserLogout(): Unit = {
        id = 1
        password = ""
        user_name = "anonymous"
    }


    def CheckSkill(): String = {
        println("FFFSSSSDF!")
        "ffasdfasdf"
    }


    def UserRegister(login: String, password: String): Int = {
        val (tid, tpass) = DBWorker.FindUser(login)
        id = tid
        this.password = tpass
        if (id <= 0) {
            val rs = DBWorker.AddUser(login, password)
            val (tid, tpass) = DBWorker.FindUser(login)
            id = tid
            0
        } else
            -1
    }
}
