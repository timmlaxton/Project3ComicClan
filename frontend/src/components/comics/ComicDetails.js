import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';
import Review from '../reviews/Review'
import ReviewForm from '../reviews/ReviewForm';
import Request from '../../helpers/request.js'

const ComicDetails = (props) => {
  console.log(props);
  if(!props.comic){
    return "Loading...Comic Details"
  }
  function handleReviewPost(review){
    props.userReviewPost(review, props.comic)
  }
  console.log(props.user);
  return (
    <div className="comic-component">
    <h1>Comic Details</h1>
        <Comic comic={props.comic}/>
        <Review comic={props.comic} user={props.user}/>
        <ReviewForm comic={props.comic} user={props.user} handleReviewPost={handleReviewPost}/>
    </div>
  )

}

export default ComicDetails;
