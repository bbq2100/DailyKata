object ForComprehension {
  val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
    
    for(dog <- dogBreeds) println(dog) // creating a generator with <- operator
    
    
}