package com.example.recyclerviewgmail

class GmailModel {
    var sender: String = ""
    var title: String = ""
    var content: String = ""
    var time: String = ""
    var isMark: Boolean = false
    var logoPath: String = ""

    constructor(sender: String, title: String, content: String, time: String, isMark: Boolean, logoPath: String){
        this.sender = sender
        this.title = title
        this.content = content
        this.time = time
        this.isMark = isMark
        this.logoPath = logoPath
    }
}