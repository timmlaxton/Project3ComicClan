import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Comic = (props) => {

  if(!props.comic){
    return "Loading...comic"
  }



  return (
    <React.Fragment>
      <h1>Writer: {props.comic.writer}</h1>
      <p>Letterer: {props.comic.letterer}</p>
      <p>Artist: {props.comic.artist}</p>
      <p>Colourer: {props.comic.colourer}</p>
    </React.Fragment>
  )

}

export default Comic;
