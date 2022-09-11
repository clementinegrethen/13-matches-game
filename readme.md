# 13-matches game

The game of 13 matches is played by two players who take turns taking 1, 2 or 3 matches from a pile that initially contains 13 matches. The player who takes the last match loses.
The application to be developed must allow two players to compete. It is the computer that
is the referee of the game. It displays the number of matches remaining in the game, gives the hand in turn to each player and checks that the
to each player in turn and checks that the players respect the rules of the game. Thus, if a player
wants to take too many or too few matches, the move is refused and the player must replay. A player
must remove between 1 and 3 matches. At the end of the game, the referee displays the result.
Each player chooses the move to play according to a strategy. A human strategy
consists in asking the user what he wants to play. This allows to have a human player.
The other strategies consist in making the computer play and define its level of play. A
non-exhaustive list of levels of play, and thus of corresponding strategies, includes :
- naive level: the computer randomly chooses the number of matches to play,
- fast level : the computer takes as many matches as possible (so that the game ends as quickly as possible)
the game ends as quickly as possible),
- expert level : the computer plays the best it can (if it can win, it will win).
The following listing is a copy of the information displayed on the screen during the course of a game
of a game between the user (Xavier) and the computer (Computer) in naive level.
