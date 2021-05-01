#the purpose of this file is to allow the user to input anything they like until they type, each input is then outputed to a txt file which the user can then open and read
file = open("output.txt", "w") #opens a .txt file called output and if one isn't found it creates a new one
while True: #while true simply puts it into an infinite loop
    current = input()#this is where the user inputs text
    if (current.lower() == "done"): #checks if the user has input done
        break #since the program is supposed to stop when it detects done, if it does this will break from the loop
    file.write(current + "\n")#this line appends the user's text to the txt file and starts a new line for the next input

file.close();#closes output.txt
