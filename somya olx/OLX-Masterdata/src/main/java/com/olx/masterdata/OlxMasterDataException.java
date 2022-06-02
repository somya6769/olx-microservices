package com.olx.masterdata;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.olx.masterdata.exception.OlxNoAdvStatusFoundException;
import com.olx.masterdata.exception.OlxNoCategoriesFoundException;

@RestControllerAdvice
public class OlxMasterDataException {
	@ExceptionHandler(OlxNoCategoriesFoundException.class)
	public ResponseEntity<Object> handleOlxMasterDataExceptionn() {
		return new ResponseEntity<>("Categories not found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(OlxNoAdvStatusFoundException.class)
	public ResponseEntity<Object> handleOlxMasterDataException() {
		return new ResponseEntity<>("Status  not found", HttpStatus.NOT_FOUND);
	}

}
