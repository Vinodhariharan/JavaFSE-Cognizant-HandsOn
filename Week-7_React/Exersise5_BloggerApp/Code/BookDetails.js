
function BookDetails({ books }) {
  return (
    <div>
      <h1>Book Details</h1>
      {books.map(book => (
        <div key={book.id}>
          <h2>{book.bname}</h2>
          <h3>{book.price}</h3>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;