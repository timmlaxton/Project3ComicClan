import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';

const ComicDetails = (props) => {

  if(!props.comic){
    return "Loading...Comic Details"
  }


  return (
    <div className="comic-component">
      <Comic comic={props.comic}/>
    </div>
  )

}

export default ComicDetails;
