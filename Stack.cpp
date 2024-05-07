#include<iostream>
#include<string>

using namespace std;

//a node stores one item in the stack 
struct Node{
    string data;
    Node* next; // points to next node in the stack
};

class Stack{
    private:
        Node* top;
    public:
        Stack(); //constructor
        ~Stack(); //destructor
        bool isEmpty() {return (top == NULL);}; //checks if top is null, if it is then it returns true
        void push(string d); // pushes a node containing data d to stack
        string pop(); // pop top node off stack, return string data
        string toString(); //print stack to console

};
Stack::Stack(){
    top = NULL;
}
Stack::~Stack(){
    while (!isEmpty()){
        cout << "Deleting Node" <<endl;
        pop();
    }
}

void Stack :: push(string d){
    Node* newTop = new Node;
    newTop -> data = d; //sets data held in this node to be string d
    newTop -> next = top; //points new node to the new top of the stack

    top = newTop; //makes new node new top of the stack
}

string Stack :: pop(){
    if (isEmpty()){
        cout << "Cannot pop from an empty stack" <<endl;
        exit(1);
    }
    else{
        string value = top->data; // assigns whatever data is at the top of our node to the value variable
        Node* oldTop = top;
        top = top->next; //reassigns the top of the stack to the second top element

        delete oldTop;
        return value; //holds value of popped node
    }
}

string Stack :: toString(){ //prints stack in a readable format
    string result = "(top) -> ";
    Node* current = top;
    while (current != NULL){
        result += current->data + " -> ";
        current = current ->next;
    }
    result += "NULL";
    return result;

}

int main(){
    
    Stack *s = new Stack();
    cout << s->toString() << endl;
    s -> push("Yoda");
    s -> push("Chewie");
    s -> push("R2D2");

    cout << s->toString() << endl;
    s-> pop();
    cout << s->toString() << endl;

    delete s;

    return 0;
}