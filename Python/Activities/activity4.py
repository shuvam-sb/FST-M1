# Enhance the previously written Rock-Paper-Scissors code so that it asks the user if they want to play another round.
# If they say 'Yes', the game should begin again.
# If they say 'No', the game should exit.
play_again = 'yes'
while(play_again == 'yes'):
    player1 = input("Enter player 1 symbol : ")
    player2 = input("Enter player 2 symbol : ")
    if player1 == player2:
        print("It's a tie!")
    elif (player1 == 'rock' and player2 == 'scissors') or \
        (player1 == 'scissors' and player2 == 'paper') or \
        (player1 == 'paper' and player2 == 'rock'):
        print("Player 1 wins!")
    elif (player2 == 'rock' and player1 == 'scissors') or \
        (player2 == 'scissors' and player1 == 'paper') or \
        (player2 == 'paper' and player1 == 'rock'):
        print("Player 2 wins!")
    else:
        print("Invalid input! Use rock, paper, or scissors.")
    play_again = input("Want to play another round (yes/no) : ")
    if(play_again == "yes"):
        pass
    # If they say no, exit the game
    elif(play_again == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit


