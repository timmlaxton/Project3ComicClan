import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';
import Review from '../reviews/Review'
import ReviewForm from '../reviews/ReviewForm';
import Descriptions from '../descriptions/Descriptions'

const ComicDetails = (props) => {


  if(!props.comic){
    return "Loading...Comic Details"
  }

  // const CriticForm = (props) => {
  //   event.preventDefault();
  //   const review = {
  //     "review": event.target.review.value,
  //     "comic": props.comic.id
  //   }
  // }

  return (
    <div className="comic-component">


        <Comic comic={props.comic}/>
        <Review comic={props.comic}/>
        <ReviewForm comic={props.comic} />
        <div className="description-box">
        <p>{props.comic.description}</p>
        </div>



    </div>
  )


}

export default ComicDetails;
