package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by neko on 2017/6/24.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
