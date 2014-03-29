object ForComprehension {
  val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

  for (dog <- dogBreeds) println(dog) // creating a generator with <- operator

  val filteredBreeds = for {
    breed <- dogBreeds
    if breed.contains("Terrier")
    if !breed.startsWith("Yorkshire")
  } yield breed

  for{
    breed <- dogBreeds
    upperCasedBreed = breed.toUpperCase()
  } println(upperCasedBreed)
}
