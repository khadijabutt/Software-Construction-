#include <iostream>
#include <string>
using namespace std;

class Channel
{
private:
	string value;
	string description;
	Channel* nextChannel;

public:
	Channel()
	{
		value = "";
		nextChannel = NULL;
	}				//end constructor

	Channel(string val, string detail, Channel* next)
	{
		value = val;
		description = detail;
		nextChannel = next;
	}				//end constructor

	string get_value(){		//getters/ setters
		return value;
	}

	void set_value(string val){
		value = val;
	}

	string get_description(){
		return description;
	}

	void set_description(string detail){
		description = detail;
	}

	Channel* get_next(){
		return nextChannel;
	}

	void set_next(Channel* next){
		nextChannel = next;
	}
	
};				//end class

class TV_Manager{		//Tv Manager
private: 
	Channel* head;
public:

	TV_Manager(){

		head = NULL;		//initialize head to NULL
	}

	void Add_Channel(string val, string detail){		//Add a new channel

		Channel* new_channel = new Channel;

		new_channel->set_value(val);		//set new node values
		new_channel->set_description(detail);
		new_channel->set_next(NULL);
		

		if (head == NULL){		//if head equals to NULL, add at start
			head = new_channel;
		}
		else{
			Channel* temp =new Channel;		//else traverse till last node
			temp = head;
			while (temp->get_next() != NULL){
				temp = temp->get_next();
			}
			
			temp->set_next(new_channel);		//insert at last
			
			
		}
	}

	void Replace_Channel(string new_val, string old_val){
		Channel *temp = head;

		if (temp == NULL){
			cout << "\nlist is empty" << endl;
		}
		else{
			while (temp->get_value() != old_val){		//traverse till old value found
				temp = temp->get_next();
			}
			temp->set_value(new_val);		//replace with new
			
		}
		
	}


	void delete_Channel(string delete_value){
		Channel *temp = head;

		if (temp == NULL){
			cout << "\nlist is empty" << endl;
		}
		else{
			while (temp->get_next()->get_value() != delete_value){		//traverse till delete valur found
				temp = temp->get_next();
			}
			Channel *delete_node = temp->get_next();		//delete that node
			temp->set_next(delete_node->get_next());
			delete delete_node;
		}
	}


	void display(){
		Channel *temp = head;
		if (temp == NULL){
			cout << "\nlist is empty" << endl;
		}
		else {
			int i = 1;
			cout << "\n";
			while (temp != NULL){		//while list is not empty, print each node
				cout << i << "	URL :" << temp->get_value() << endl << "	Description :" << temp->get_description() << endl << endl;
				temp = temp->get_next();
				i++;
			}
		}
	}
};

int main(){
	TV_Manager tv;
	tv.Add_Channel("https://www.youtube.com/channel/UCJFp8uSYCjXOMnkUyb3CQ3Q", "Tasty foods");	//add new channel
	tv.Add_Channel("https://www.youtube.com/user/craftingeek", "Crafting Geek!");
	tv.Add_Channel("https://www.youtube.com/channel/UChKlSK39lLg8eZHIX0iVzLA", "DIY Creators");
	tv.delete_Channel ("https://www.youtube.com/user/craftingeek");			//delete channel
	tv.Replace_Channel("https://www.youtube.com/channel/UChKlSK39lLg8eZHIX0iVzLA", "https://www.youtube.com/channel/UCJFp8uSYCjXOMnkUyb3CQ3Q");		//replace channel
	tv.display();

}