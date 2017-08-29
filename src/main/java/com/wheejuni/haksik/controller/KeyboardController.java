package com.wheejuni.haksik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wheejuni.haksik.domain.KeyBoard;

@RestController
public class KeyboardController {
	
	@GetMapping("/keyboard")
	public KeyBoard getDefaultKeyboard(){
		return KeyBoard.returnDefaultKeyboard();
	}

}
