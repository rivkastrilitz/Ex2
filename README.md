
# directed weighted graph and pokemon game:
This repository represents a structure of a weighted graph,
with some algorithms that can be used on the graph .
in addition, there is a pokemon game that can operate on the graph.

 ### uses of the program:
1) can be used as a GPS, can contain many cities locations,
 and calculate the shortest path from one destination to another
2) can be used as a shape creator, create mane nodes and edges for a shape,
and calculate the shortest path from one node to another.
3)playing the pokemons game.

# Part 1:
### structure:
the graph is built from vertices that are represented by the NodeData class, which implements the node_data interface.
and from edges that are represented by EdgeData which implements the edge_data interface.
the graph is represented by the DWGraph_DS class that implements the directed_weighted_graph interface.
the algorithms of the graph are represented by the DWGraph_Algo,
which implements the dw_graph_algorithms interface.

## the graph:
### the graph class includes functions such as:

* add node -  add a new node to the graph
* has an edge - return if there  is an edge between two vertices
* connect - add a new edge to the graph between two vertices
* get v - return a full collection of the graph vertices
*get E-return a collection representing all the edges getting out of
 a given vertex
* remove node - remove a vertex from the graph
* remove edge - remove an edge between two vertices
* node size - return the number of vertices in the graph
* edge size - return the number of edges in the graph
*get mc-return the number of changes that computed on the graph 

## the graph algorithms :
### the graph algorithms class includes functions such as:

* init - initiate the graph algorithm to point on a graph
* copy - Compute a deep copy of the graph in the graph algorithms
* is connected - return true if all of the graph vertices have a path from one to another.
* shortest path Dist - return the shortest path by weight from one vertex to another
* shortest Path - return a list with the information of the vertices in the path from one vertex to another
* save - save a graph from the graph algorithms as a Jasonobject 
* load - load a graph from a Jasonobject to the graph algorithms

### particulars functions that based on an external code:

* is connected function base on the "breadth-first search" algorithm.
* shortest path Dist and shortest Path based on the "Dijkstra's " algorithm.

### links:
* Dijkstra's algorithm: https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
* breadth-first search algorithm: https://en.wikipedia.org/wiki/Breadth-first_search

 # part 2 -the pokemons game:
the purpose of the game is to eat as many pokemons as possible using the agents and doing that with minimum moves.
for this part of the project, we have been given a server.
we use the information that we get from deserialized the server Jason objects to write the arena(represented with a directed weighted graph) and to get the pokemons and the agents. 

### structure :
the game is built from the arena of the game. on the arena, we can add pokemons objects and agents objects.
 class Ex2 uses to run the game.
also, there is 3 GUI classes to enable us to see the game.

## CL_Pokemon:
each pokemon have a type, value, edge that he located on and position on the graph.

## CL_Agents:
each agent has a  position, an id, value, and speed.

## Arena:
this class contains function such as:
* GraphRange - returns the graph range as a range2D object.
* w2f - adjust the range of the graph to a range that suits the frame.
* correct_pokemon_edge - returns the current pokemon edge according to the pokemon position on the graph.
* init_Agents_by_game - crate agents object from the Jason object that has been received from the server.
* get_Agents_update - update agents from the Jason object that has been received from the server.
* pokemon_contain - the function checks that the pokemon that the agent is looking for is available.
* pokemon_in_search - the function checks if the current pokemon is already in progress of searching.
* json2Pokemons_update - the function return a list of pokemons by the json information the function gets
* closest_pokemon - the function returns the closest pokemon to a specific agent.
* on_pokemon_edge - checks if the current agent is on an edge with a pokemon.

## Ex2:
in this class, there is an algorithm that calculates the best way to move the agents across the graph in order to eat the pokemons.
this class contains function such us:
* init_graph_to_algo - this function set the graph, to   the number of the level provided
* init_pokemones - this function get the pokemons from the game and set them to a list
then go over the list and insert them into a Priority Queue.
* add_all_agents - the function returns a Queue of pokemons that contain all the pokemons,
 that is currently set to an agent.
* game_full_move - this function make updates to the pokemons and agents, and updating the next move.


## frame:
this class used to create a GUI frame on which we will add Jpanels.

## entryPanel:
 this class is used to make a log -in panel .
in this panel the user can login with his id, in order to save his scores. and also to put the number of the scenario that he wishes to play in.
this class implements the ActionListener interface, so that when pressing the botton "start game" the game will start.

 ## Panel:
 this class is used for making  graphics for the game.
this class contins function such us :
* updateFram e- uses to update the range of the panel. 
* paint - build the grapics of the arena.
* drawGraph - drawing the graph by colling draw node and draw edge.
* drawPokemons - drowing the pokemons on the graph. 
* drawAgants - drowing the agents on the  graph.
* drawClock  -making a timer for the game.

### particulars classe that based on an external code:
* clasess : Panel,entryPanel,frame,Arena,CL_Agents base on 

### How To Run :
* to run this program you should pull this repository to your git
* by the next commend -
* $ git clone https://github.com/rivkastrilitz/Ex2.git
* then to use the program on your computer create a main class,
and use the class in the weighted graph program.
* or if you want to run the full pokemon game just use the Jar Ex2.
