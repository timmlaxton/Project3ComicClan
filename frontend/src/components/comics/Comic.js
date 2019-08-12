import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';


const Comic = (props) => {

  if(!props.comic){
    return "Loading...comic"
  }



  const url = "/comics/" + props.comic.id;

  return (
    <React.Fragment>

      <Link to={url} className="name">

  <img src={props.comic.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" />
      </Link>




      <p>Writer: {props.comic.writer}</p>
      <p> Title: {props.comic.title}</p>
      <p>Letterer: {props.comic.letterer}</p>
      <p>Artist: {props.comic.artist}</p>
      <p>Colourer: {props.comic.colourer}</p>
      <p>Publisher: {props.comic.publisher.name}</p>
    </React.Fragment>
  )

}

export default Comic;
