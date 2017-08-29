package com.wheejuni.haksik.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.haksik.domain.Cafeteria.CafName;
import com.wheejuni.haksik.domain.KeyBoard;
import com.wheejuni.haksik.domain.KeyBoard.CampusSelectKeys;

public class KeyBoardTest {

	@Test
	public void seoulKeyboard() {
		KeyBoard key = KeyBoard.returnSeoulKeyboard();
		assertEquals(CafName.SEOUL_INMUN.getCafName(), key.getButtons().get(0));
	}

}
