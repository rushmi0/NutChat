package org.nutchat.core

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform