fun main(args: Array<String>) {
    println("Hello, World!")

val cyphertext="WKH HDVLHVW PHWKRG RI HQFLSKHULQJ D WHAW PHVVDJH LV WR UHSODFH HDFK FKDUDFWHU EB DQRWKHU XVLQJ D ILAHG UXOH, VR IRU HADPSOH HYHUB OHWWHU D PDB EH UHSODFHG EB G, DQG HYHUB OHWWHU E EB WKH OHWWHU H DQG VR RQ.";
val alphabet="abcdefghijklmnopqrstuvwxyz";

  print("\nThe cypher challenge text is :\n");

  for (i in cyphertext.indices){
    if (i%30 == 0) print("\n");
    print(cyphertext[i]);
  }
    print("\n\nAaand, translated the text is :\n");

    for (c in cyphertext){
      // translated letters
      if (c == 'W') print("t"); else
      if (c == 'K') print("h"); else
      if (c == 'H') print("e"); else

      // trying these ones
      if (c == 'D') print("a"); else
      if (c == 'V') print("s"); else

      // display the letter we don't know yet
      print(c);
    }
    println();

}