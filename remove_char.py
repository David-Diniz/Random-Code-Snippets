def remove_character(string, character_to_be_removed, end_string):
    if len(string) == 0:
        return end_string
    if string[0] != character_to_be_removed:
        end_string += string[0]
    return remove_character(string[1:], character_to_be_removed, end_string)

user_string = input("Hello world, input a string: ")
user_delete = input("What character would you like to be removed from that string? ")
print("String before deletion: " + user_string)
print(remove_character(user_string, user_delete, ""))