import React from 'react';
import GiphyImage from './GiphyImage';

interface Book {
  id: number;
  name: string;
}

interface BookListProps {
}

interface BookListState {
  books: Array<Book>;
  isLoading: boolean;
}

class BookList extends React.Component<BookListProps, BookListState> {

  constructor(props: BookListProps) {
    super(props);

    this.state = {
      books: [],
      isLoading: false
    };
  }

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('http://localhost:8080/books')
      .then(response => response.json())
      .then(data => this.setState({books: data, isLoading: false}));
  }

  render() {
    const {books, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div>
        <h2>Book Listopia</h2>
        {books.map((book: Book) =>
          <div key={book.id}>
            {book.name}<br/>
             <GiphyImage name={book.name}/>
          </div>
        )}
      </div>
    );
  }
}

export default BookList;