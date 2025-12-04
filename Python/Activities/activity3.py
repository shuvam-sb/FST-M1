#Make a two-player Rock-Paper-Scissors game.
#Remember the rules:
#Rock beats scissors
#Scissors beats paper
#Paper beats rock
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