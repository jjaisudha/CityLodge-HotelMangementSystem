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
	public boolean addRoom(List<Room> allRoomsList) {
		Room room = new Room();
		String input;
		List<String> roomlist = allRoomsList.stream().map(r -> r.getRoomId()).collect(Collectors.toList());
		System.out.println("BeforeL::" + roomlist);
		System.out.print("Enter room Id,Prefix R_ for Standard Room|S_for Suite room :");
		Scanner scanner = new Scanner(System.in);
		input = scanner.next();
		if (validate.validateRoomid(allRoomsList, input))
			room.setRoomId(input);
		else {
			// throw new Room creation exception reason: Room id is not valid();
			System.out.println("Room id is not valid");
			return false;
		}
		System.out.print("Enter Rome Type R->Standard Room | S-> Suite room:");
		input = scanner.next();
		if (validate.validateRoomType(room.getRoomId(), input))
			room.setRoomType(input);
		else {
			// throw new Room creation exception reason: Room type is not valid();
			System.out.println("Room Type is not valid");
			return false;
		}
		System.out.print("Enter number of bed:");
		input = scanner.next();
		if (validate.validateBeds(room.getRoomType(), Integer.valueOf(input)))
			room.setNoofbed(Integer.valueOf(input));
		else {
			// throw new Room creation exception reason: bed is not valid();
			System.out.println("Number of beds for " + room.getRoomType() + " is not valid");
			return false;
		}
		System.out.print("Enter Summary of the room ");
		input = scanner.next();
		String[] s=input.split("\\s+");
		System.out.println(input.length());
		if (s.length <= 20) {
			room.setSummary(input);
		} else {
			System.out.println("Summary is beyond 20 letters");
			return false;
		}
		room.setRoomStatus("Available");

		allRoomsList.add(room);

		System.out.println("Room has be added successfully!!!!!!!!");

		roomlist = allRoomsList.stream().map(r -> r.getRoomId()).collect(Collectors.toList());
		// System.out.println("After " + roomlist);
		return false;
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
