import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';
import Review from '../reviews/Review'
import ReviewForm from '../reviews/ReviewForm';
import Request from '../../helpers/request.js'
import Descriptions from '../descriptions/Descriptions'

const ComicDetails = (props) => {
  if(!props.comic){
    return "Loading...Comic Details"
  }
  function handleReviewPost(review){
    console.log(review);
    props.userReviewPost(review)
  }
  return (
    <div className="comic-component">


        <Comic comic={props.comic}/>

        {/*<Review comic={props.comic} user={props.user}/>
        <ReviewForm comic={props.comic} user={props.user} handleReviewPost={handleReviewPost}/>*/}
        <div className="comicdescription-box">

        <p>{props.comic.description}</p>
        </div>
    </div>
  )

}

export default ComicDetails;
