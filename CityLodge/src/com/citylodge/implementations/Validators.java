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

			/*
			 * if (allRooms.size() != 0) { for (Room r : allRooms) { if
			 * (!r.getRoomId().equalsIgnoreCase(input)) return true; } }
			 */
		} else
			return false;
		return false;
	}

	public boolean validateRoomType(String room_id, String input) {
		if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("S")) {
			if (room_id.startsWith("R_") && input.equalsIgnoreCase("R"))
				return true;
			else if (room_id.startsWith("S_") && input.equalsIgnoreCase("S"))
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean validateBeds(String roomType, int noofbeds) {
		if (roomType.equals("R")) {
			if (noofbeds == 1 || noofbeds == 2 || noofbeds == 4)
				return true;
			else
				return false;
		} else if (roomType.equals("S")) {
			if (noofbeds == 6)
				return true;
			else
				return false;
		} else
			return false;
	}

}
