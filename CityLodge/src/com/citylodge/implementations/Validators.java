package com.citylodge.implementations;

import java.util.List;

import com.citylodge.beans.Room;

public class Validators {

	private int value = 1;

	public int getNext() {
		return value++;
	}

	public boolean validateRoomid(List<Room> allRooms, String input) {
		if (input.toUpperCase().startsWith("R_") || input.toUpperCase().startsWith("S_")) {
			if (!allRooms.stream().anyMatch(i -> i.getRoomId().equalsIgnoreCase(input)))
				return true;
		} else
			return false;
		return false;

	}

}
