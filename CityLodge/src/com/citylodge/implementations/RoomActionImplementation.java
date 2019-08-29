package com.citylodge.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.citylodge.beans.Room;
import com.citylodge.interfaces.RoomActionInterface;

public class RoomActionImplementation implements RoomActionInterface {
	
	List<Room> suitroom = new ArrayList<Room>();

	@Override
	public void addRoom() {
		Room r1= new Room();
		Validators val = new Validators();
		//To do - u shoudl write a genric method which will generate u a sequence int number
		r1.setRoomId(val.getNext());
		r1.setNoofbed(2);
		r1.setRoomType("Suit");
		suitroom.add(r1);

		/*
		 * for(Room item : suitroom){ System.out.println(item.getRoomType()); }
		 */
	}

	@Override
	public void rentRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayRoom() {
		// TODO Auto-generated method stub
		System.out.println(suitroom);

	}

}
