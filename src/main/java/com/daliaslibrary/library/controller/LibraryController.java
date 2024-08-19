package com.daliaslibrary.library.controller;

import org.springframework.web.bind.annotation.RestController;
import com.daliaslibrary.library.v1.api.BookApi;
import com.daliaslibrary.library.v1.api.BorrowApi;
import com.daliaslibrary.library.v1.api.LibraryApi;

@RestController
public class LibraryController implements BookApi, BorrowApi, LibraryApi{

}
