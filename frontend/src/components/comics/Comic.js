import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Comic = (props) => {

  if(!props.comic){
    return "Loading...comic"
  }
  const url = "/comics/" + props.comic.id;
  const publisherUrl = props.comic._links.publisher.href;
  const publisherName = props.comic._links.publisher.name;
  console.log(props.comic._embedded.reviews);
  if(props.comic._embedded.reviews){
    var total = 0;
    for(const review of props.comic._embedded.reviews){
    total += review.rating
    }
  console.log(total);
  var avgRating = total / props.comic._embedded.reviews.length
  }else{
    avgRating = "No Reviews yet. :("
  }
  // double total = 0;
  //   for (int i = 0; i < this.getReviewsAmount(); i++) {
  //       total += this.reviews.get(i).getRating();
  //   }
  //   double averageRating = total / this.getReviewsAmount();
  //   this.rating = average


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
      <p>Rating: {avgRating}</p>
    </React.Fragment>
  )

}

export default Comic;
