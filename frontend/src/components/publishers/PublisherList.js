import React from 'react';
import Publisher from './Publisher';

const PublisherList = (props) => {

  const publishers = props.publishers.map((publisher, index) => {
    return (
      <li key={index} className="component-item">
        <div className="component">
          <Publisher publisher={publisher} />
        </div>
      </li>
    )
  })

  return (
    <ul className="component-list">
      {publishers}
    </ul>
  )

}

export default PublisherList;
