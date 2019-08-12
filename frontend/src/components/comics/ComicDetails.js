import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';
import ReviewForm from '../reviews/ReviewForm';

const ComicDetails = (props) => {

  if(!props.comic){
    return "Loading...Comic Details"
  }


  return (
    <div className="comic-component">

      <Comic comic={props.comic}/>
          <ReviewForm />
    </div>
  )


}

export default ComicDetails;
