import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';
import Review from '../reviews/Review'
import ReviewForm from '../reviews/ReviewForm';

const ComicDetails = (props) => {

  if(!props.comic){
    return "Loading...Comic Details"
  }



  return (
    <div className="comic-component">




    <h1>Comic Details</h1>
        <Comic comic={props.comic}/>
        <Review comic={props.comic}/>
        <ReviewForm comic={props.comic} />


    </div>
  )


}

export default ComicDetails;
