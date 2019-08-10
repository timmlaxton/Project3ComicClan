import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';
import ReviewForm from '../reviews/ReviewForm';

const Comic = (props) => {

  if(!props.comic){
    return "Loading...comic"
  }

  const url = "/comics/" + props.comic.id;

  return (
    <React.Fragment>
      <h1>Comic Details</h1>
      <Link to={url} className="name">
        <h1>Writer: {props.comic.writer}</h1>
      </Link>
      <p>Letterer: {props.comic.letterer}</p>
      <p>Artist: {props.comic.artist}</p>
      <p>Colourer: {props.comic.colourer}</p>
      <p>Publisher: {props.comic.publisher.name}</p>
      <ReviewForm />
    </React.Fragment>
  )

}

export default Comic;
