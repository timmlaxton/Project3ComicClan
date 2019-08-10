import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Comic = ({comic}) => {

  if(!comic){
    return "Loading...comic"
  }

  const url = "/comics/" + comic.id;

  return (
    <React.Fragment>
      <Link to={url} className="name">
        {comic.writer}
      </Link>
      <p>Letterer: {comic.letterer}</p>
      <p>Artist: {comic.artist}</p>
      <p>Colourer: {comic.colourer}</p>
    </React.Fragment>
  )

}

export default Comic;
