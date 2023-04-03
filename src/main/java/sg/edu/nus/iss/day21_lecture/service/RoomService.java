package sg.edu.nus.iss.day21_lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day21_lecture.model.Room;
import sg.edu.nus.iss.day21_lecture.repository.InterfaceRoomRepository;

@Service
public class RoomService implements InterfaceRoomRepository {
    @Autowired
    InterfaceRoomRepository roomRepo;

    public int count() {
        return roomRepo.count();
    }

    public int deleteById(Integer id) {
        return roomRepo.deleteById(id);
    }

    public List<Room> findAll() {
        return roomRepo.findAll();
    }

    public Room findById(Integer id) {
        
        return roomRepo.findById(id);
    }

    public Boolean save(Room room) {
        return roomRepo.save(room);
    }

    public int update(Room room) {
        return roomRepo.update(room);
    }
}
