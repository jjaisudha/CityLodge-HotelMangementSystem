package com.citylodge.interfaces;

import java.util.List;

import com.citylodge.beans.Room;

public interface RoomActionInterface {

	boolean addRoom(List<Room> allRooms);
	void rentRoom();
	void returnRoom();
	void displayRoom();
	
}
