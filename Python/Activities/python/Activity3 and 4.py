while True:
    player1 = input("Enter rock, paper or scissors: ").lower()
    player2 = input("Enter rock, paper or scisors: ").lower()
    if player1 == player2:
        print("It's a draw!")
    elif player1 not in ["rock","paper","scissors"] and player2 not in ["rock","paper","scissors"]:
        print("invalid input!Enter only rock or paper or scissors")
    elif player1 == "rock" and player2 == "scissors":
        print("player1 wins!")
    elif player1 == "scissors" and player2 == "paper":
        print("player1 wins!")
    elif player1 == "paper" and player2 == "rock":
        print("player1 wins!")
    else:
        print("player2 wins!")
    play_again = input("Do you want to play another round? (Yes/NO): ").lower()
    if play_again == "no":
        print("game ended")
        break
  

