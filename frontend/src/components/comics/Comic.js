import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';


const Comic = (props) => {

  if(!props.comic){
    return "Loading...comic"
  }



  const url = "/comics/" + props.comic.id;
  const publisherUrl = props.comic._links.publisher.href;
  const publisherName = props.comic._links.publisher.name;

  return (
    <React.Fragment>

      <Link to={url} className="name">

  <img src={props.comic.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" />
      </Link>



      <p> Title: {props.comic.title}</p>
      <p>Writer: {props.comic.writer}</p>
      <p>Letterer: {props.comic.letterer}</p>
      <p>Artist: {props.comic.artist}</p>
      <p>Colourer: {props.comic.colourer}</p>
      <p>Publisher: {props.comic._embedded.publisher.name}</p>
    </React.Fragment>
  )

}

export default Comic;
