Main ::= Main_Program
Main_Program ::= Main_Program’’ Main_Program’
Main_Program’ ::= Main_Program
Main_Program’ ::= ''
Main_Program’’ ::= Declaration ;
Main_Program’’ ::= Assignment ;
Main_Program’’ ::= City ;
Declaration ::= const Declaration’
Declaration ::= Declaration’
Declaration’ ::= coord spr = Coord
Declaration’ ::= string spr = String
Declaration’ ::= num spr = Expression
Declaration’ ::= List spr = ListContent
DeclarationList’ ::= Type
DeclarationList’ ::= restaurant
DeclarationList’ ::= city
DeclarationList’ ::= num
DeclarationList’ ::= string
DeclarationList’ ::= coord
Assignment ::= # spr = Assignment’
Assignment’ ::= coord Coord
Assignment’ ::= num Expression
Assignment’ ::= string String
Assignment’ ::= list ListContent
List ::= list < DeclarationList’ >
ListContent ::= [ Inner_List ]
Inner_List ::= Expression Inner_List’
Inner_List ::= ''
Inner_List’ ::= , Expression Inner_List’
Inner_List’ ::= ''
Expression ::= Additive
Additive ::= Multiplicative Additive’
Additive’ ::= + Multiplicative Additive’
Additive’ ::= - Multiplicative Additive’
Additive’ ::= ''
Multiplicative ::= Exponential Multiplicative’
Multiplicative’ ::= * Exponential Multiplicative’
Multiplicative’ ::= / Exponential Multiplicative’
Multiplicative’ ::= // Exponential Multiplicative’
Multiplicative’ ::= ''
Exponential ::= Unary Exponential’
Exponential’ ::= ^ Unary Exponential’
Exponential’ ::= ''
Unary ::= + Primary
Unary ::= - Primary
Unary ::= Primary
Primary ::= 0
Primary ::= spr
Primary ::= ( Additive )
City ::= city spr { City’ }
City' ::= 1 ali večkrat;
RESTAVRACIJA

City’ ::= City’’’ ; City’’
City’’ ::= City’
City’’ ::= ''
City’’’ ::= City_Constructs
City’’’ ::= Declaration
City’’’ ::= Assignment
City’’’ ::= Print
City’’’ ::= For
Print ::= print ( Expression )
City_Constructs ::= Restaurant
City_Constructs ::= Road
Restaurant ::= restaurant spr { Name Shape Marker Routes }
Name ::= name : String
String ::= spr
String ::= a
Shape ::= shape : { Lines }
Lines ::= # Line # Line # Line Line’
Line’ ::= # Line Line’
Line’ ::= ''
Line ::= line [ Coord , Coord ]
Coord ::= spr
Coord ::= ( Expression , Expression )
Marker ::= Marker’
Marker ::= ''
Marker’ ::= marker : Point
Point ::= point [ Coord ]
Routes ::= Routes’
Routes ::= ''
Routes’ ::= routes : [ Roads ]
Roads ::= Road Road’
Road’ ::= , Road Road’
Road’ ::= ''
Road ::= road spr { Name Road_Shapes }
Road_Shapes ::= shape : { Road_Shapes’ Road_Shapes }
Road_Shapes ::= ''
Road_Shapes’ ::= # Road_Shape Road_Shapes’
Road_Shapes’ ::= ''
Road_Shape ::= Line
Road_Shape ::= Bend
Bend ::= bend [ Coord , Coord , Expression ]
For ::= foreach spr in Variable { Program }
Variable ::= spr Variable’
Variable ::= Radius
Variable’ ::= . Variable’’
Variable’ ::= ''
Variable’’ ::= spr
Variable’’ ::= routes
Radius ::= radius [ Coord , Expression ]
Program ::= Program’’ ; Program’
Program’ ::= Program
Program’ ::= ''
Program’’ ::= Declaration
Program’’ ::= Assignment
Program’’ ::= Print
Program’’ ::= Highlight
Highlight ::= highlight ( spr )

spr -> [a-zA-Z_]+
a -> ^"(?s).*"$
0 -> ^-?\d+(\.\d+)?([eE][-+]?\d+)?$