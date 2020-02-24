public class Hotel {
    private Reservation[] rooms;
    // each element corresponds to a room in the hotel;
    // if rooms[index] is null, the room is empty;
    // otherwise, it contains a reference to the Reservation
    // for that room, such that
    // rooms[index].getRoomNumber() returns index
    private ArrayList waitList;

    // contains names of guests who have not yet been
    // assigned a room because all rooms are full
    // if there are any empty rooms (rooms with no reservation),
    // then create a reservation for an empty room for the
    // specified guest and return the new Reservation;
    // otherwise, add the guest to the end of waitList
    // and return null
    public Reservation requestRoom(String guestName) {
        /* to be implemented in part (a) */ }

    // release the room associated with parameter res, effectively
    // canceling the reservation;
    // if any names are stored in waitList, remove the first name
    // and create a Reservation for this person in the room
    // reserved by res; return that new Reservation;
    // if waitList is empty, mark the room specified by res as empty and
    // return null
    // precondition: res is a valid Reservation for some room
    // in this hotel
    public Reservation cancelAndReassign(Reservation res) {
        /* to be implemented in part (b) */ }
    // constructors and other methods not shown
}