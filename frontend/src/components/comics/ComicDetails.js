import React, {Component} from 'react';
import Comic from './Comic';
import {Link} from 'react-router-dom';
import Review from '../reviews/Review'
import ReviewForm from '../reviews/ReviewForm';
import Request from '../../helpers/request.js'

const ComicDetails = (props) => {

  if(!props.comic){
    return "Loading...Comic Details"
  }

  function handleReviewPost(review) {
    console.log(review);
    const request = new Request();
    request.post('api/reviews', review).then(() => {
      // window.location = '/comics/' + props.comic.id
    })
  }
  //
  // const handleSubmit = (event) => {
  //     console.log(event.target.user.value);
  //     event.preventDefault();
  //     props.onUserSelected(u)
  //     console.log(user);
  //   }
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
