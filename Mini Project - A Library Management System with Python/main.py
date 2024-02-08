from book import Book_functions
from magazines import Magazine_functions
from educational_DVD import DVD_functions
from lecture_CD import CD_functions

print("                             <<< ONLINE LIBRARY SYSTEM >>>")
print("                                =======================")
print("OUR MAIN RESOURCES : 1 - Books | 2 - Magazines | 3 - Educational DVDs | 4 - Lecture CDs | 5 - Exit \n")
resource = int(input("Please Select a Resource type : "))

try:
    if resource == 1:
        while True:
            print("\n 1 - Add a new Book to the system \n 2 - Remove a Book from the system \n "
                  "3 - View currently available Books \n 4 - View currently unavailable Books \n 5 - Search a Book \n "
                  "6 - Lend a Book \n 7 - Receive a Book\n")
            option = int(input("Please Select an Option : "))

            if option == 1:
                obj1 = Book_functions()
                obj1.add_book()
            elif option == 2:
                obj2 = Book_functions()
                obj2.remove_book()
            elif option == 3:
                obj3 = Book_functions()
                obj3.available_book()
            elif option == 4:
                obj4 = Book_functions()
                obj4.unavailable_book()
            elif option == 5:
                obj5 = Book_functions()
                obj5.search_book()
            elif option == 6:
                obj6 = Book_functions()
                obj6.lend_book()
            elif option == 7:
                obj7 = Book_functions()
                obj7.receive_book()
            e = input("press e to exit..\npress any key to continue..")
            if e == 'e':
                exit()
            else:
                continue

    elif resource == 2:
        while True:
            print("\n 1 - Add a new Magazine to the system \n 2 - Remove a Magazine from the system \n "
                  "3 - View currently available Magazines \n 4 - View currently unavailable Magazines \n "
                  "5 - Search a Magazine \n 6 - Lend a Magazine \n 7 - Receive a Magazine\n")
            option = int(input("Please Select an Option : "))

            if option == 1:
                obj1 = Magazine_functions()
                obj1.add_magazine()
            elif option == 2:
                obj2 = Magazine_functions()
                obj2.remove_magazine()
            elif option == 3:
                obj3 = Magazine_functions()
                obj3.available_magazine()
            elif option == 4:
                obj4 = Magazine_functions()
                obj4.unavailable_magazine()
            elif option == 5:
                obj5 = Magazine_functions()
                obj5.search_magazine()
            elif option == 6:
                obj6 = Magazine_functions()
                obj6.lend_magazine()
            elif option == 7:
                obj7 = Magazine_functions()
                obj7.receive_magazine()

            e = input("press e to exit..\npress any key to continue..")
            if e == 'e':
                exit()
            else:
                continue

    elif resource == 3:
        while True:
            print("\n 1 - Add a new Educational DVD to the system \n 2 - Remove a Educational DVD from the system \n "
                  "3 - View currently available Educational DVDs \n 4 - View currently unavailable Educational DVDs \n "
                  "5 - Search a Educational CD \n 6 - Lend a DVD \n 7 - Receive a DVD")

            option = int(input("Please Select an Option : "))

            if option == 1:
                obj1 = DVD_functions()
                obj1.add_DVD()
            elif option == 2:
                obj2 = DVD_functions()
                obj2.remove_DVD()
            elif option == 3:
                obj3 = DVD_functions()
                obj3.available_DVD()
            elif option == 4:
                obj4 = DVD_functions()
                obj4.unavailable_DVD()
            elif option == 5:
                obj5 = DVD_functions()
                obj5.search_DVD()
            elif option == 6:
                obj6 = DVD_functions()
                obj6.lend_DVD()
            elif option == 7:
                obj7 = DVD_functions()
                obj7.receive_DVD()

            e = input("press e to exit..\npress any key to continue..")
            if e == 'e':
                exit()
            else:
                continue

    elif resource == 4:
        while True:
            print("\n 1 - Add a new Lecture CD to the system \n 2 - Remove a Lecture CD from the system \n "
                  "3 - View currently available Lecture CDs \n 4 - View currently unavailable Lecture CDs \n "
                  "5 - Search a Educational CD \n 6 - Lend a CD \n 7 - Recipe a CD")

            option = int(input("Please Select an Option : "))

            if option == 1:
                obj1 = CD_functions()
                obj1.add_CD()
            elif option == 2:
                obj2 = CD_functions()
                obj2.remove_CD()
            elif option == 3:
                obj3 = CD_functions()
                obj3.available_CD()
            elif option == 4:
                obj4 = CD_functions()
                obj4.unavailable_CD()
            elif option == 5:
                obj5 = CD_functions()
                obj5.search_CD()
            elif option == 6:
                obj6 = CD_functions()
                obj6.lend_CD()
            elif option == 7:
                obj7 = CD_functions()
                obj7.receive_CD()

            e = input("press e to exit..\npress any key to continue..")
            if e == 'e':
                exit()
            else:
                continue

    elif resource == 5:
        print("Thank You! Come Again..")
    exit()
except:
    print("\nError : Hmm..Somthing Went Wrong..Please Try Again!")