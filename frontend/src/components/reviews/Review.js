import React from 'react';

const Review = (props) => {
  if(!props.comic._embedded.reviews){
    return(
      <>
      <p>No Reviews yet :(</p>
      <p>Be the first?</p>
      </>
    )
  }
  else{
  const reviews = props.comic._embedded.reviews.map((review, index) => {
    return <li key={index}>"{review.review}" -  left by: {review.user.alias}</li>
  })

  return (
      <React.Fragment>
        <ul>Reviews: {reviews}</ul>
      </React.Fragment>
  )
}
}

export default Review;
