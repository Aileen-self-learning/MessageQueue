package com.example.messagequeue

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/download")
class RequestReceiveController(
  private val requestProcessService: RequestProcessService
) {

  @PostMapping
  fun doDownload()
  = requestProcessService.doDownload()
}