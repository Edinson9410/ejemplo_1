package compiladorautomatas;
import static compiladorautomatas.Tokens.*;
%%
%class Lexer
%type Tokens
L = [a-bA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"Declare" {return Declare;}
"Entero" {return Entero;}
"Real" {return Real;}
"Cadena" {return Cadena;}
"Fecha" {return Fecha;}
"Logico" {return Logico;}

. {return ERROR;}
