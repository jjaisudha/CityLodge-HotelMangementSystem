package com.citylodge.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.citylodge.beans.Room;
import com.citylodge.interfaces.RoomActionInterface;

public class RoomActionImplementation implements RoomActionInterface {
	
	Validators validate = new Validators();

	@Override
	public void addRoom(List<Room> allRoomsList) {
		Room room= new Room();
		String input;
		List<String> roomlist = allRoomsList.stream().map(r->r.getRoomId()).collect(Collectors.toList());
		System.out.println("BeforeL::"+roomlist);    
		//To do - u shoudl write a genric method which will generate u a sequence int number
		System.out.print("Enter room Id,Prefix R_ for Standard Room|S_for Suite room :");
		Scanner scanner = new Scanner(System.in);
		 input= scanner.next();
		if(validate.validateRoomid(allRoomsList,input))
			room.setRoomId(input);
		else 
			System.out.println("Room id is not valid");
		/*
		 * System.out.print("Enter Rome Type R->Standard Room | S-> Suite room:"); input
		 * =scanner.next();
		 */
		
		
		allRoomsList.add(room);
		/*
		 * r1.setRoomId(val.getNext()); r1.setNoofbed(2); r1.setRoomType("Suit");
		 */

		/*
		 * for(Room item : suitroom){ System.out.println(item.getRoomType()); }
		 */
		//allRooms.stream().forEach(System.out::println);
		roomlist = allRoomsList.stream().map(r->r.getRoomId()).collect(Collectors.toList());
		System.out.println("After "+roomlist);    
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

	}

}
