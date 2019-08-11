import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';


const Comic = (props) => {

  if(!props.comic){
    return "Loading...comic"
  }

const reviews = props.comic.reviews.map((review, index) => {
  return <li key={index}>{review.review}</li>
})

  const url = "/comics/" + props.comic.id;

  return (
    <React.Fragment>

      <Link to={url} className="name">
        <h1>{props.comic.title}</h1>
      </Link>
      <img src={props.comic.image} alt="Comic Cover"/>
      <p>Writer: {props.comic.writer}</p>
      <p>Letterer: {props.comic.letterer}</p>
      <p>Artist: {props.comic.artist}</p>
      <p>Colourer: {props.comic.colourer}</p>
      <p>Publisher: {props.comic.publisher.name}</p>
      <ul>Reviews: {reviews}</ul>
    </React.Fragment>
  )

}

export default Comic;
