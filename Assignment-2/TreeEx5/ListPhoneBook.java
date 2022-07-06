import java.util.ArrayList;

public class ListPhoneBook {
  
  public int size(ArrayList<PhoneBook> list){
    return list.size();
  }

  public void insert(ArrayList<PhoneBook> list, PhoneBook phoneBook){
    list.add(phoneBook);
    return;
  }
  
  public long find(ArrayList<PhoneBook> list, PhoneBook phoneBook){
    for (PhoneBook phone : list){
      if (phone.name == phoneBook.name) return phone.phoneNumber;
    }
    return -1;
  }
}
