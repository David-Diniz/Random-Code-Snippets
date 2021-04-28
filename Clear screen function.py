#for the longest time i could never clear the console in python, this is how i did it
import os #os is needed
cls = lambda: os.system("cls") #makes a lambda function called cls which will clear the screen
for i in range (5):
    print ("HAHAHAHAHAHA")#will print this 5 times,cluttering the screen

input()#makes you press enter to clear the screen
cls()#uses the clear function created earlier
print("Stuff was once here")
