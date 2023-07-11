package com.example.messagequeue

enum class TaskStatus(val label: String) {
  FINISHED("Finished"),
  PROCESSING("Processing"),
  PENDING("Pending")
}
